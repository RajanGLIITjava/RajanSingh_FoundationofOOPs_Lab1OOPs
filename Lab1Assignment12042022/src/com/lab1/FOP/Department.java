package com.lab1.FOP;


class Department {
	int DepttTechnical;
	int DepttAdmin;
	int DepttHumanResource;
	int DepttLegal;

	Department() {
		int DepttTechnical = 1;
		int DepttAdmin = 2;
		int DepttHumanResource = 3;
		int DepttLegal = 4;
	}
	public int getDepttTechnical() {
		return DepttTechnical;
	}

	public void setDepttTechnical(int depttTechnical) {
		DepttTechnical = depttTechnical;
	}

	public int getDepttAdmin() {
		return DepttAdmin;
	}

	public void setDepttAdmin(int depttAdmin) {
		DepttAdmin = depttAdmin;
	}

	public int getDepttHumanResource() {
		return DepttHumanResource;
	}

	public void setDepttHumanResource(int depttHumanResource) {
		DepttHumanResource = depttHumanResource;
	}

	public int getDepttLegal() {
		return DepttLegal;
	}

	public void setDepttLegal(int depttLegal) {
		DepttLegal = depttLegal;
	}
}

