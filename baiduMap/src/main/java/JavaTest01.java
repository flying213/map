import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaTest01 {
    public static void main(String[] args) {
        People people = new People();
        people.setId("11412323412");
        User user = BeanUtil.copyProperties(people, User.class);
        log.info("复制之后的实例 "+user.getId());
    }
}
