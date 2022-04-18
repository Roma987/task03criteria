package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

public final class DAOFactory {
	// ========= Реализация Singletom ====================
	// экземпляр
	private static final DAOFactory instance = new DAOFactory();
	// метод, возвращающий этот экземпляр
	public static DAOFactory getInstance() {
		return instance;
	}
	// скрываем конструктор по умолчанию
	private DAOFactory() {
	}
	// ==================================================


	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}
}


