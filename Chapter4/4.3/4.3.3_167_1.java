hive (default)>SELECT e.ename, d.deptno, l. loc_name 
FROM  emp e 
JOIN  dept d ON d.deptno = e.deptno 
JOIN   location l ON  d.loc = l.loc;
