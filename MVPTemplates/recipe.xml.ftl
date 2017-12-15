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
    </#if>

    <#if viewType='fragment'>
      <instantiate from="src/app_package/Kotlin Fragment View.kt"
                     to="${escapeXmlAttribute(srcOut)}/${name}Fragment.kt" />
    </#if>

    <open file="${srcOut}/${name}Contract.kt"/>
</recipe>
