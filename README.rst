Test project for PrettyFaces + CDI conversations.

Just deploy to a JBoss AS 7.1.0.CR1b server to reproduce the problems.

The ``FacesServlet`` is currently mapped using ``/faces/*``. To change the mapping 
just switch to the other configuration by updating ``web.xml`` and ``pretty-config.xml``.