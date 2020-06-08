package com.test;

import com.entity.DepartEntity;
import com.entity.EmpEntity;
import com.mapper.TabEmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {

//        测试
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        try {
            /*根据主配置文件获取SQLSessionFactory
            * SQLSessionFactory对应的数据，一个工程可能有多个，
            * 所以直接获取，其实获取的是默认数据源
            * 也可以通过evenvironment的id来获取指定的数据源*/
            Reader reader = Resources.getResourceAsReader("mybatisConfig.xml");
            SqlSessionFactory factory=sqlSessionFactoryBuilder.build(reader);
            /*获取SqlSession：负责增删改查，共享一个SQLSessionFactory。启动的是一个工程，
            那么一般情况下一个工程中SQLSessionFactory一个数据源一个，SqlSession会有很多个
            * */
            SqlSession session=factory.openSession();
            //sqlSession负责增删改查，使用完毕之后需要关闭  增删改需要commit提交
            //session可以通过xml来执行：_指明sql语句：namespace+id
/*            List<EmpEntity> list=session.selectList("com.mapper.TabEmpMapper.selectEmp1");
            System.out.println(list);*/
            //session也可以通过接口来执行对应的sql
            TabEmpMapper mapper=session.getMapper(TabEmpMapper.class);
            /*List l1=mapper.selectEmp1();
            List l2=mapper.selectEmp2();
            List l3=mapper.selectEmp3();
            String str4=mapper.selectEmp4(1);
            List<String > str5=mapper.selectEmp5(1);
            System.out.println(l1);
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(str4);
            System.out.println(str5);*/

/*            List l6=mapper.selectEmp6();
            List l7=mapper.selectEmp7();*/
/*            List<DepartEntity> l8=mapper.selectDept1();
            for (DepartEntity ll:l8){
                System.out.println(ll.getDepartName());
                //System.out.println(ll.getEmps());
            }*/

            /*mapper.insertDept("aaa",null);
            session.commit();*/

            /*HashMap map=new HashMap();
            map.put("empName","A");
            List list=mapper.selectDeptEmp(map);
            System.out.println(list);*/


           /* Map map=new HashMap();
            map.put("departName","A");
            map.put("departState","1");
            List list=new ArrayList();
            list.add(map);
            mapper.insertDeptMore(list);
            Map map2=new HashMap();
            map2.put("departName","A");
            map2.put("departState","1");
            list.add(map2);
            mapper.insertDeptMore(list);*/


           /*调存储过程*/
            HashMap map=new HashMap();
            map.put("departId",1);
            System.out.println(mapper.selectCall(map));


            //关闭，如果是增删改，需要先提交在关闭
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

















