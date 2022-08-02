import com.lmonkey.domain.Lmonkey_Product;
import com.lmonkey.service.Imp.Lmonkey_ProductServiceImp;
import com.lmonkey.service.Lmonkey_ProductService;
import org.junit.Test;

import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_ProductServiceImp_Test {
    @Test
    public void selectAll(){
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        List<Lmonkey_Product> lmonkey_products = lmonkey_productService.selectAll();
        for (Lmonkey_Product l:lmonkey_products){
            System.out.println(l);
        }
    }

    @Test
    public void update(){
        Lmonkey_ProductService lmonkey_productService = new Lmonkey_ProductServiceImp();
        Lmonkey_Product lmonkey_product = new Lmonkey_Product(null,"javaSE","无",200,10,28,29,"jb.png");
        int result = lmonkey_productService.update(lmonkey_product);
        if (result>0){
            System.out.println("成功！");
        }else {
            System.out.println("失败");
        }
    }
}
