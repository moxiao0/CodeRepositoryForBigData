hive (default)> select e.empno, e.ename, d.deptno from emp e left join dept d on e.deptno=d.deptno;