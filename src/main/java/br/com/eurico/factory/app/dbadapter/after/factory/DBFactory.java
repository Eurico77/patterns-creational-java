package br.com.eurico.factory.app.dbadapter.after.factory;

import br.com.eurico.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
