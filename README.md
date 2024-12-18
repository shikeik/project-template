# JavaLibDevelopmentTemplate

## 介绍
xxx

## 使用教程
1. 修改`settings.gradle`
    - `rootProject.name` 改为你的
    - `include('core', 'examples', 'util')` 根据需求修改, 记得同步修改模块的build.gradle依赖
2. 重构软件包名
3. 最后根据需求修改`README.md`

## 项目配置
- ``idea``-2024.3
- `java`-1.8
- `gradle`-7.6.2
- `junit`-4.13.2

## 版本更新
### `0.2.0`: 增加基础仓库url以及顶级build.gradle配置

### `0.1.0`: 基本配置
1. 使用`gradle-7.6.2`创建`java-library`项目
2. 模块: 
   1. 设置`core`模块用于核心功能开发, 应用`plugin`: `java-library`, 依赖: 测试工具库`junit-4.13.2`
   2. `examples`模块用于演示示例
   3. `utils`用于通用工具类
3. 设置`idea`使用`javaJDK-8`