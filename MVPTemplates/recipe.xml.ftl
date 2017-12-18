<?xml version="1.0"?>
<recipe>

    <#if generateContract>
      <instantiate from="src/app_package/Kotlin Contract.kt"
                    to="${escapeXmlAttribute(srcOut)}/${name}Contract.kt" />
    </#if>

    <#if generatePresenter>
      <instantiate from="src/app_package/Kotlin Presenter.kt"
                  to="${escapeXmlAttribute(srcOut)}/${name}Presenter.kt" />
    </#if>
	
    <#if viewType='activity'>
      <instantiate from="src/app_package/Kotlin Activity View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Activity.kt" />
	  <instantiate from="res/layout.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/activity_${escapeXmlAttribute(layoutName)}.xml" />
    </#if>

    <#if viewType='fragment'>
      <instantiate from="src/app_package/Kotlin Fragment View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Fragment.kt" />
	  <instantiate from="res/layoutf.xml.ftl"
                 to="${escapeXmlAttribute(resOut)}/layout/fragment_${escapeXmlAttribute(layoutName)}.xml" />
    </#if>
	
				 
    <open file="${srcOut}/${name}Presenter.kt"/>
	<open file="${escapeXmlAttribute(resOut)}/layout/${escapeXmlAttribute(layoutName)}.xml" />
</recipe>
