package ${packageName}.action

/**
 * @author: liuchao
 * @desc: ${desc}
 */
sealed class ${moduleName}Action {
    data class Click${moduleName}Action(var index: Int?=null): ${moduleName}Action()
}