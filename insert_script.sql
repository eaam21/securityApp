-- ROLE_LOGISTICA:
-- usuario: empleado
-- password: 123456
-- ROLE_ADMIN:
-- usuario: administrador
-- password: 123
	
INSERT INTO `tb_rol` VALUES (1,'ROLE_LOGISTICA'),(2,'ROLE_ADMIN');
INSERT INTO `tb_usuario` VALUES (1,'Perez','perez@gmail.com','Pepe','$2a$12$G1RQdIgKsT9GihYR027sOOkjQ.dVyQU2oiJjDfPnfdriY0zAMf1dm','empleado'),(2,'Gonzales','gonzales@gmail.com','Jorge','$2a$12$tqvuOjZtWuWQvOLYaSMXa.xOjqv0wKqcbXMzwI9WKe8N3vQvww/gy','administrador');
INSERT INTO `tb_usuario_roles` VALUES (1,1),(2,2);
