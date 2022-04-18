package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Validator {

	private Validator() { }

	public static boolean criteriaValidator(final Criteria criteria) {

		switch (criteria.getGroupSearchName()) {
			case "Oven", "Laptop", "TabletPC": break;
			default: return false;
		}
		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			if (entry.getValue() == null) {
				return  false;
			}
		}
		return true;
	}
}

//you may add your own new classes