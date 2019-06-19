<?xml version="1.0"?>
<recipe>

    <#--  创建Activity或者Fragment  -->
    <#if viewType='activity'>
      <instantiate from="src/app_package/Kotlin Activity View.kt"
                    to="${escapeXmlAttribute(srcOut)}/${ifOtherPackage}${moduleName}Activity.kt" />

      <instantiate from="res/layout.xml.ftl"
                    to="${escapeXmlAttribute(resOut)}/layout/activity_${escapeXmlAttribute(layoutName)}.xml" />
    </#if>

    <#if viewType='fragment'>
      <instantiate from="src/app_package/Kotlin Fragment.kt"
                    to="${escapeXmlAttribute(srcOut)}/${ifOtherPackage}${moduleName}Fragment.kt" />

      <instantiate from="res/layoutf.xml.ftl"
                    to="${escapeXmlAttribute(resOut)}/layout/fragment_${escapeXmlAttribute(layoutName)}.xml" />
    </#if>

    <#if viewType='viewpageFragment'>
      <instantiate from="src/app_package/Kotlin Fragment ViewPage View.kt"
                    to="${escapeXmlAttribute(srcOut)}/${ifOtherPackage}${moduleName}Fragment.kt" />

      <instantiate from="res/layoutviewpagef.xml.ftl"
                    to="${escapeXmlAttribute(resOut)}/layout/fragment_${escapeXmlAttribute(layoutName)}.xml" />
    </#if>

    <#--  创建Manager  -->
    <#if createManager='manager'>
      <instantiate from="src/app_package/Kotlin Manager.kt"
                    to="${escapeXmlAttribute(srcOut)}/manager/${moduleName}Manager.kt"/>
    </#if>

    <#if createManager='managerViewPage'>
      <instantiate from="src/app_package/Kotlin ViewPage Manager.kt"
                    to="${escapeXmlAttribute(srcOut)}/manager/${moduleName}Manager.kt"/>
    </#if>

    <#--  创建Repository  -->
    <#if createRepository='repository'>
      <instantiate from="src/app_package/Kotlin Repository.kt"
                    to="${escapeXmlAttribute(srcOut)}/data/${moduleName}Repository.kt"/>
    </#if>
    <#--  创建Model  -->
    <#if createModel='model'>
      <instantiate from="src/app_package/Kotlin Model.kt"
                    to="${escapeXmlAttribute(srcOut)}/model/${moduleName}Model.kt"/>
    </#if>
    
    <#--  创建Action  -->
    <#if createAction='action'>
      <instantiate from="src/app_package/Kotlin Action.kt"
                    to="${escapeXmlAttribute(srcOut)}/action/${moduleName}Action.kt"/>
    </#if>
    <#--  创建State  -->
    <#if createState='state'>
      <instantiate from="src/app_package/Kotlin State.kt"
                    to="${escapeXmlAttribute(srcOut)}/state/${moduleName}State.kt"/>
    </#if>
    <#--  创建port click  -->
    <#if createClick='click'>
      <instantiate from="src/app_package/Kotlin IClick.kt"
                    to="${escapeXmlAttribute(srcOut)}/port/I${moduleName}Click.kt"/>
    </#if>
    <#--  创建VO  -->
		<#if createVo='vo'>
      <instantiate from="src/app_package/Kotlin Vo.kt"
                    to="${escapeXmlAttribute(srcOut)}/vo/I${moduleName}Vo.kt"/>
    </#if>


	<open file="${escapeXmlAttribute(resOut)}/layout/${escapeXmlAttribute(layoutName)}.xml" />
</recipe>
