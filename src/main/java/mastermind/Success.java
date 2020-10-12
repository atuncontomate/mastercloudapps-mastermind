package mastermind;

enum Success {

	BLACK,
	WHITE,
	NULL_SUCCESS;
	
	public boolean isNull() {
		return this.equals(Success.NULL_SUCCESS);
	}

}
