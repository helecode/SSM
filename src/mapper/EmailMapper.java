package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;

import entity.Email;

public interface EmailMapper {
	@Select("select * from email where id = #{0}")
	public Email selectEamil(int  id);
}
