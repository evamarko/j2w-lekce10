[#ftl]

[@c.page title="Student ${student.jmeno} ${student.prijmeni}"]
    <h1>Student ${student.jmeno} ${student.prijmeni}</h1>
    <p><a href="/trida/${student.trida.id}">Třída: ${student.trida}</a></p>
    <h2>Rodiče:</h2>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">E-mail</th>
            <th scope="col">Telefonní číslo</th>
            <th scope="col"></th>
        </tr>
        </thead>
        <tbody>
        [#list rodice as rodic]
            <tr>
                <td>${rodic.jmeno}</td>
                <td>${rodic.prijmeni}</td>
                [#if rodic.email??]
                    <td>${rodic.email}</td>
                [/#if]
                [#if rodic.telefon??]
                    <td>${rodic.telefon}</td>
                [/#if]
                <td><a href="/rodic/${rodic.id}">Detail</a></td>
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]
