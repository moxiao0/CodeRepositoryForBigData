<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/
dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.anjiplus.template.gaea.business.modules.dashboardwidget.
dao.ReportDashboardWidgetMapper">

    <resultMap type="com.anjiplus.template.gaea.business.modules.dashboardwidget.
dao.entity.ReportDashboardWidget" id="ReportDashboardWidgetMap">
        <!--jdbcType="{column.columnType}"-->
        <result property="id" column="id"  />
        <result property="reportCode" column="report_code"  />
        <result property="type" column="type"  />
        <result property="setup" column="setup"  />
        <result property="data" column="data"  />
        <result property="collapse" column="collapse"  />
        <result property="position" column="position"  />
        <result property="refreshSeconds" column="refresh_seconds"  />
        <result property="enableFlag" column="enable_flag"  />
        <result property="deleteFlag" column="delete_flag"  />
        <result property="sort" column="sort"  />
        <result property="createBy" column="create_by"  />
        <result property="createTime" column="create_time"  />
        <result property="updateBy" column="update_by"  />
        <result property="updateTime" column="update_time"  />

    </resultMap>

    <sql id="Base_Column_List">
        id,report_code,`type`,setup,`data`,`position`,collapse,enable_flag,
delete_flag,sort,create_by,create_time,update_by,update_time
    </sql>

    <!--自定义sql -->

</mapper>
