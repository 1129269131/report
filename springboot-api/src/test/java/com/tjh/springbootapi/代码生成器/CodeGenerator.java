package com.tjh.springbootapi.代码生成器;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.koala.apiprototype.utils.BaseCodeGenerator;

import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {
    public static void main(String[] args) {
        //字段名和枚举名的映射，不区分表名
        Map<String, String> enumColumnMap = new HashMap<>();
        enumColumnMap.put("STATE", "StateEnum");

        BaseCodeGenerator.setEnumColumnMap(enumColumnMap);

        //指定生成的模块
        //BaseCodeGenerator.setLimitedGenerateModules(BaseCodeGenerator.GenerateModule.Entity, BaseCodeGenerator.GenerateModule.MapXml);
        BaseCodeGenerator.setLimitedGenerateModules(BaseCodeGenerator.GenerateModule.Controller, BaseCodeGenerator.GenerateModule.MapXml,
                BaseCodeGenerator.GenerateModule.Service, BaseCodeGenerator.GenerateModule.Dao, BaseCodeGenerator.GenerateModule.Entity);

        BaseCodeGenerator.setModuleName("springboot-api");//多module项目，需指定moduleName
        //指定entity生成到独立的module里，并生成api interface
        /*BaseCodeGenerator.setClientInterfaceModuleName("taxi-auth-interface");
        BaseCodeGenerator.setClientInterfaceSubFolder(null);//文件夹
        BaseCodeGenerator.setClientInterfaceBasePackage("com.xmgps.taxi.auth");*/

        AutoGenerator defaultConfig = BaseCodeGenerator.getDefaultConfig();
        defaultConfig.getStrategy().setInclude("book_index");//需要生成的表，可指定多个，不传参为全部表生成
        BaseCodeGenerator.generate(defaultConfig);
    }
}
