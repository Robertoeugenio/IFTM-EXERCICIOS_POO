package design_Observer;
public class Seguradora implements Monitor{
+
+	@Override
+	public void alarmeDisparado() {
+		System.out.println("Vamos chamar a policia!!!!!");
+		
+	}
+
+}