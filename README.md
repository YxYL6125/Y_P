# Y_P

最近才开始学SpringBoot了，想着就用这个shitCode来充当第一个试验品吧，只能重构了**...**

---

##### 数据库设计：

**Porn详细表(porn_details)**

| 序号 | 名称       | 别名（注释） | 类型    | 长度（字符） |
| ---- | ---------- | ------------ | ------- | ------------ |
| 1    | porn_id    | Porn编号     | int     | 225          |
| 2    | porn_time  | Porn时长     | VARCHAR | 225          |
| 3    | porn_href  | Porn超链接   | VARCHAR | 225          |
| 4    | porn_title | Porn标题     | VARCHAR | 225          |
| 5    | porn_types | Porn类型     | VARCHAR | 225          |
| 6    | porn_watch | Porn播放量   | VARCHAR | 225          |



---

### 遇到的问题

- 访问JSP页面报错According to TLD or attribute directive in tag file, attribute value does not accept

  > **出现上述错误的原因是，在JSP页面使用了fmt标签库**
  >
  > 解决方法一：（推荐）
  >
  > ```jsp
  > <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  > <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  > //使用了日期格式化方法
  > <fmt:formatDate pattern="yyyy-MM-dd" value="${user.birthday}" />
  > ```
