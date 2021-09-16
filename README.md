# StoredProcedureOracle

create or replace NONEDITIONABLE PROCEDURE GETALLUSERS(uemail IN app_user.email%TYPE,
uname OUT app_user.name%TYPE)
IS
BEGIN
  SELECT  name INTO uname FROM APP_USER WHERE email=uemail;
END GETALLUSERS;
