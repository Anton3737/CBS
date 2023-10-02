<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
<!--        <html lang="en">-->
            <html xmlns="http://www.w3.org/1999/html" xml:lang="en" lang="ua">
            <style>
                html {
                background-color: rgb(42, 42, 42);
                charset: UTF-8;
                }

                body {
                margin-top: 100px;
                height: 100%;
                }

                .centre {
                position: relative;
                width: 80%;
                height: 500px;
                margin: 0 auto;
                }

                .fromJavaPars {
                position: absolute;
                margin-top: 30px;
                margin-left: 50px;
                width: 100%;
                }

                table {
                border: 2px solid #000000;
                width: 500px;
                height:500px;
                border-radius: 25px;
                padding: 30px;
                margin: 0 auto;
                margin-top: 50px;
                margin-bottom: 50px;
                background-image: linear-gradient(to right bottom, #1256bb, #008be5, #00b5cd, #00d782, #a8eb12);
                transition-duration: 0.3s;
                }

                table:hover {
                border: 2px solid #000000;
                width: 550px;
                height:550px;
                border-radius: 50px;
                padding: 40px;
                margin: 0 auto;
                margin-top: 50px;
                margin-bottom: 50px;
                background-image: linear-gradient(to left top, #1256bb, #008be5, #00b5cd, #00d782, #a8eb12);
                transition: 0.3s;
                }

                h2 {
                text-align: center;
                color: #cc4adb;
                font-size: 20px;
                margin-top: 50px;
                }
            </style>

<!--            <meta charset="UTF-8">-->
<!--            <meta name="viewport" content="width=device-width, initial-scale=1">-->

            <body>

                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="Plant">

        <div class="centre">

            <table>
                <tr>
<!--                    <h2>Plant Information</h2>-->
                    <th colspan="2"><h3><xsl:value-of select="Name"/> (Code: <xsl:value-of select="@code"/>)</h3></th>
                </tr>
                <tr>
                    <td><strong>Soil:</strong></td>
                    <td><xsl:value-of select="Soil"/></td>
                </tr>
                <tr>
                    <td><strong>Origin:</strong></td>
                    <td><xsl:value-of select="Origin"/></td>
                </tr>
                <tr>
                    <td colspan="2"><strong>Visual Parameters:</strong></td>
                </tr>
                <tr>
                    <td><strong>Stem Color:</strong></td>
                    <td><xsl:value-of select="VisualParameters/StemColor"/></td>
                </tr>
                <tr>
                    <td><strong>Leaf Color:</strong></td>
                    <td><xsl:value-of select="VisualParameters/LeafColor"/></td>
                </tr>
                <tr>
                    <td><strong>Size:</strong></td>
                    <td><xsl:value-of select="VisualParameters/Size"/></td>
                </tr>
                <tr>
                    <td colspan="2"><strong>Growing Tips:</strong></td>
                </tr>
                <tr>
                    <td><strong>Temperature:</strong></td>
                    <td><xsl:value-of select="GrowingTips/Temperature"/></td>
                </tr>
                <tr>
                    <td><strong>Light:</strong></td>
                    <td><xsl:value-of select="GrowingTips/Light"/></td>
                </tr>
                <tr>
                    <td><strong>Watering:</strong></td>
                    <td><xsl:value-of select="GrowingTips/Watering"/></td>
                </tr>
                <tr>
                    <td><strong>Multiplying:</strong></td>
                    <td><xsl:value-of select="Multiplying"/></td>
                </tr>
            </table>

        </div>
    </xsl:template>

</xsl:stylesheet>
