import com.lmonkey.domain.Lmonkey_Cart;
import com.lmonkey.service.Imp.Lmonkey_CartServiceImp;
import com.lmonkey.service.Lmonkey_CartService;
import org.junit.Test;

/**
 * 购物车测试类
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_CartServiceImp_Test {

    @Test
    public void update(){
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        int result = lmonkey_cartService.update(3,"adm002", 7);
        System.out.println(result);
    }

    @Test
    public void selectByUidPid(){
        Lmonkey_CartService lmonkey_cartService = new Lmonkey_CartServiceImp();
        Lmonkey_Cart lmonkey_cart = lmonkey_cartService.selectByUidPid("adm002", 8);
        System.out.println(lmonkey_cart);
        if (lmonkey_cart!=null){
            System.out.println("ok");
        }
    }
}
