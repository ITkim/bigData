drop table apart;
drop table interest;
create table apart (
    area_name varchar2(40),
    area_size varchar2(60),
    year_date varchar2(10),
    month_date number(2),
    price_per_m_2 number(5)
);

create table interest (
    bank varchar2(60),
    category varchar2(60),
    rate number(5,2)
);

�ѱ� �ε��� �ڷ� -> Data Access Object (csv�� java�� �а� DB�� ���� -> sql�� �˻� -> java)
����Ʈ DTO (����, �Ը𱸺�, �о簡��)

<���� ? �ð��� �����ϴٸ�>
���� �Է��ϴ� ����
(�� ����, �����, [������ϴ� ����Ʈ DTO (����, �Ը�) -> �о簡��] )

�����
: ���� ������ϴ� ����Ʈ�� ����� n���� ���ҽ��ϴ�.
