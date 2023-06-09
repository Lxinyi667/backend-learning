package top.lxyi.context;

public interface ApplicationContext {
    /**
     * 根据beanId获取对应的Bean实例
     * @param beanId
     * @return
     */
    Object getBean(String beanId);
}
