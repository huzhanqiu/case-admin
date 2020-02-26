package com.hzq.nacos.caseadmincommon;

import com.hzq.nacos.caseadmincommon.test.User;
import com.hzq.nacos.caseadmincommon.test.UserDto;
import net.sf.cglib.beans.BeanCopier;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDateTime;

/**
 * @Author: huzq
 * @Date: 2020/1/17/10:53 上午
 * @Description: case-admin
 */
public class DtoToEntity {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        User user = new User();
        user.setAge(1);
        user.setCsrq(LocalDateTime.now());
        user.setName("小明");
        user.setZp("nihao".getBytes());

        UserDto userDto = new UserDto();
//        BeanUtils.copyProperties(userDto,user);
//        System.out.println(userDto);
        // 动态生成用于复制的类,false为不使用Converter类
        BeanCopier copier = BeanCopier.create(User.class, UserDto.class, false);
        // 执行source到target的属性复制
        copier.copy(user, userDto, null);
        System.out.println(userDto.toString());
    }
}
