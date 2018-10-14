SUMMARY = "ITS Tool allows you to translate your XML documents with PO files"
HOMEPAGE = "http://itstool.org/"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=59c57b95fd7d0e9e238ebbc7ad47c5a5"

inherit autotools python3native

DEPENDS = "python3-native python3-lxml-native"

SRC_URI = "http://files.itstool.org/${BPN}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "9415ddf6a12012ff688549d2ed767bc5"
SRC_URI[sha256sum] = "97c208b51da33e0b553e830b92655f8deb9132f8fbe9a646771f95c33226eb60"

do_install_append() {
    # fix shebang of main script
    sed -i 's:${STAGING_BINDIR_NATIVE}/${PYTHON_PN}-native/${PYTHON_PN}:${bindir}/${PYTHON_PN}:g' ${D}${bindir}/itstool
}

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += "python3 python3-lxml"

