<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">

        <style>
        html {
        charset: UTF-8;
        }
        </style>
        <html>
            <body>
                <h2>Candy Information</h2>
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="candy">
        <div>
            <h3><xsl:value-of select="name"/></h3>
            <p><strong>Flavor:</strong> <xsl:value-of select="flavor"/></p>
            <p><strong>Color:</strong> <xsl:value-of select="color"/></p>
        </div>
    </xsl:template>

</xsl:stylesheet>
