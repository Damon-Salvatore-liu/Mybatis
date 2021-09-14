import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Description:
 *
 * @author liupengli
 * @date 2021/9/11 3:57 下午
 */
public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // List<User> userList = mapper.getUsers();
        // for (User user : userList) {
        //     System.out.println(user);
        // }

        User userByID = mapper.getUserByID(1);
        System.out.println(userByID);
        sqlSession.close();

    }
}
