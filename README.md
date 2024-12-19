# libgdx_dev_template

## [Get Started](readme/docs/README_GRADLE_HELPER.md)

## [Java Doc](readme/docs/javadoc/index.html) 仅本地

## [导引](readme/导引.md)

## 开发者日志
### [shikeik](readme/devloper_logs/README_SHIKEIK.md)

## 模板日志
### `0.1.0`: 初始化三端项目模板
1. 支持三端开发: idea-android, idea-windows, aide-android
2. 配置项目内.run目录用于预设idea运行配置: 
   1. 运行android, 
   2. 运行lwjgl, 
   3. 运行gradle任务clean build
3. 简单编写一个显示libgdx的logo的MainGame作为游戏内容
4. 忽略文件: 
   1. 忽略所有build/
   2. 忽略javadoc/
   3. 忽略.idea/
   4. 忽略.gradle/
   5. 忽略.shikeik/
5. editorconfig: 
   1. 缩进统一使用tab
   2. 换行符为linux的LF即\n
6. 包含4个模块: 
   1. 核心core
   2. 平台android
   3. 平台lwjgl
   4. 示例examples

## 项目配置
- ``idea``-2024.3
- `java`-1.8
- `libgdx`-1.12.1
- `gradle`
  - `gradle`-7.6.2
  - `AGP`-7.4.1
- `android`
  - `compileSdk` 30
  - `targetSdk` 34
  - `minSdk` 21

## 参与者
- shikeik

## 项目进度

## 实际贡献者
- shikeik (提交次数: 5)
---

## 项目规范（简易版）
- 包名全部由小写字母组成
- 类名遵从大驼峰命名法，变量名遵从小驼峰命名法，方法名遵从小驼峰命名法，开放性接口请尤其注意此规范
- 不随意删除或修改其他开发者的代码，有问题或优化建议请咨询该部分开发者
- 为避免破坏兼容性，限制引入第三方类库，有引入需求请联系项目发起方，对于小型代码片段支持源码引入方式
- 在不清楚配置文件 (gradle.*) 的作用的情况下，不要随意修改配置文件
- 禁止使用反射
