[#ftl]

[@c.page title="Seznam učitelů"]
    <h1>Seznam učitelů</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Jméno</th>
            <th scope="col">Příjmení</th>
            <th scope="col">Třída</th>
        </tr>
        </thead>
        <tbody>
        [#list ucitele as ucitel]
            <tr>
                <td>${ucitel.jmeno}</td>
                <td>${ucitel.prijmeni}</td>
                [#if ucitel.trida??]
                    <td><a href="/trida/${ucitel.trida.id}">${ucitel.trida}</a></td>
                [#else]
                    <td></td>
                [/#if]
            </tr>
        [/#list]
        </tbody>
    </table>
[/@c.page]