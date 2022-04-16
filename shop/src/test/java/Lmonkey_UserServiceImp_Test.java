import com.lmonkey.domain.Lmonkey_User;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_UserService;
import org.junit.Test;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_UserServiceImp_Test {
    @Test
    public void Test_selectByid_em_mb() {

        Lmonkey_UserService lmonkey_userService = new Lmonkey_UserServiceImp();
        Lmonkey_User lmonkey_user = lmonkey_userService.selectByid_em_mb("110");
        System.out.println(lmonkey_user);
    }
}
