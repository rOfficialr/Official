import com.lmonkey.domain.Lmonkey_Category;
import com.lmonkey.service.Imp.Lmonkey_CategoryServiceImp;
import com.lmonkey.service.Imp.Lmonkey_UserServiceImp;
import com.lmonkey.service.Lmonkey_CategoryService;
import com.lmonkey.service.Lmonkey_UserService;
import org.junit.Test;

import java.util.List;

/**
 * @author 翟某人~
 * @version 1.0
 */
public class Lmonkey_CategoryImp_Test {
    @Test
    public void insert(){
        Lmonkey_CategoryService lmonkey_categoryService = new Lmonkey_CategoryServiceImp();
        Lmonkey_Category lmonkey_category = new Lmonkey_Category();
        lmonkey_category.setCate_name("five");
        lmonkey_category.setCate_parent_id(0);
//        插入
        int result = lmonkey_categoryService.insert(lmonkey_category);
        System.out.println(result);
//        查询
        List<Lmonkey_Category> lmonkey_categories = lmonkey_categoryService.selectAll();
        for (Lmonkey_Category l:lmonkey_categories){
            System.out.println(l);
        }
    }

}
