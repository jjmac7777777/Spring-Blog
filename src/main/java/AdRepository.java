public interface AdRepository extends JpaRepository<Ad, Long> {

    Ad findByTitle(String title); // select * from ads where title = ?
    Ad findFirstByTitle(String title);

    @Query("from Ad a where a.id like ?1")
    Ad getAdById(long id);

    @Query("from Ad a where a.title like %:term%")
    List<Ad> searchByTitleLike(@Param("term") String term);

}
