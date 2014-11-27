SUMMARY = "Documentation generation from docbook"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
	file://LICENSE;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde

# allarch recipes can go here
DEPENDS += "docbook-xml-dtd4 docbook-xsl-stylesheets"

SRCREV = "4c2f75cf0364e84f8bb962b0c9de791bba2b1a9f"
PV = "5.5.0"

SRC_URI += "file://0001-debug.patch"
