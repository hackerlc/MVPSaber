package ${packageName}

/**
 * ${title}
 * @author joker
 * Email:812405389@qq.com
 * @version 
 */
class ${name}Presenter(v: ${name}Contract.View):
        PresenterDataWrapper<${type},${name}Contract.View>(v),
        ${name}Contract.Presenter<${type}> {
    override fun fetch() {
    }

    override fun refreshData() {
    }

    override fun getData(): ${type} {
        return mData
    }
	
	override fun errorData(error: Throwable) {
        super.errorData(error)
        mView.get()?.onError(error)
    }

    override fun close() {
		mView.clear()
    }
}