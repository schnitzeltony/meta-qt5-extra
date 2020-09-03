SUMMARY = "oxygen fonts"
LICENSE = "GPLv3 & OFL-1.1"
LIC_FILES_CHKSUM = " \
    file://COPYING-GPL+FE.txt;md5=b10e10d276dbedbf992190166973213d \
    file://COPYING-OFL;md5=beca0db6d9408f45563228cba576a6fc \
    file://GPL.txt;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma fontcache

DEPENDS += "fontforge-native"

PV = "5.4.3"
SRC_URI = "${KDE_MIRROR}/Attic/plasma/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "a02f6580e9a53cb16694a99adbb6dbf76f17584f3e97f469a22286299507838c"

EXTRA_OECMAKE += "-DOXYGEN_FONT_INSTALL_DIR=${datadir}/fonts/truetype/oxygen"

FILES_${PN} += " \
    ${datadir}/fonts \
"
