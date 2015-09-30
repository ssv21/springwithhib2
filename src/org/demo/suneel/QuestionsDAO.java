package org.demo.suneel;

import org.springframework.orm.hibernate4.HibernateTemplate;


public class QuestionsDAO {

	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	public void saveQuestions(Questions q){
		template.save(q);
	}

	public HibernateTemplate getTemplate() {
		return template;
	
	}
	

}
