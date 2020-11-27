package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.Book;



public interface BookMapper {
	// 1.����鼮
	@Insert("insert into book (b_name,b_number,b_author,b_path,b_sark,b_tier,b_order,b_admin,b_class,b_content,b_time,b_press,b_barcode)values (#{b_name},#{b_number},#{b_author},#{b_path},#{b_sark},#{b_tier},#{b_order},#{b_admin.a_id},#{b_class.id},#{b_content},#{b_time},#{b_press},#{b_barcode})")
	public void addBook(entity.Book book);

	// 2.��ʾ�����鼮
	@Select("<script>select * from book where 1=1 <if test=\"b_id !=null and b_id!=0\"> and b_id = '${b_id}' </if> </script>")
	@Results({
			@Result(column = "typeid", property = "typeid", one = @One(select = "com.ahead.maven.dao.ReaderTypeMapper.findByIdReaderType")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public List<Book> dispBook(Book book);

	// 3.ɾ��ͼ��
	@Delete("delete from book where b_id=#{0}")
	public void deleteBook(int b_id);

	// 4.�޸�ͼ��
	@Update("<script>update book set b_name=#{b_name},b_number=#{b_number},b_author=#{b_author},b_path=#{b_path},b_sark=#{b_sark},b_tier=#{b_tier},b_order=#{b_order},b_content=#{b_content},b_press=#{b_press},b_barcode=#{b_barcode},b_class=#{b_class.id} where b_id=#{b_id}</script>")
	public void updateBook(Book book);

	// 5.ͨ��id����ͼ��
	@Select("<script>select * from book where 1=1  and b_id = #{0} </script>")
	@Results({
			@Result(column = "b_admin", property = "b_admin", one = @One(select = "com.ahead.maven.dao.AdminMapper.findByIdAdmin")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public Book findByIdBook(int b_id);

	// 6.����������ͼ��
	@Select("<script>select * from book where 1=1  and b_class = #{0} </script>")
	@Results({
			@Result(column = "b_admin", property = "b_admin", one = @One(select = "com.ahead.maven.dao.AdminMapper.findByIdAdmin")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public List<Book> bookTypeBook(int b_class);

	// 7.�����ѯ
	@Select("<script>select * from book order By b_time desc limit 0, 6</script>")
	@Results({
			@Result(column = "b_admin", property = "b_admin", one = @One(select = "com.ahead.maven.dao.AdminMapper.findByIdAdmin")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public List<Book> findTimeBook();

	// 8.�Ҳ�����
	@Select("<script>select * from book order By b_time desc limit 0, 3</script>")
	@Results({
			@Result(column = "b_admin", property = "b_admin", one = @One(select = "com.ahead.maven.dao.AdminMapper.findByIdAdmin")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public List<Book> findTimeBook2();

	// 9.���������ѯ
	@Select("<script>select * from book order By b_time desc</script>")
	@Results({
			@Result(column = "b_admin", property = "b_admin", one = @One(select = "com.ahead.maven.dao.AdminMapper.findByIdAdmin")),
			@Result(column = "b_class", property = "b_class", one = @One(select = "com.ahead.maven.dao.BookTypeMapper.findByIdBookType")) })
	public List<Book> findNewBook();

	// 10.����������Ƿ������鼮
	@Select("select count(*) from book where b_sark=#{b_sark} and b_tier=#{b_tier} and b_order=#{b_order}")
	public int findBookShelf(Book book);

	// 11.�鿴�������Ƿ����
	@Select("select * from book where b_barcode=#{b_barcode}")
	public Book findBcard(Book b);

	// 12.����������
	@Update("update book set b_number=#{b_number} where b_id=#{b_id}")
	public void updateB_Number(Book b);

}
