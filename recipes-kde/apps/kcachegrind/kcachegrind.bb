SUMMARY = "GUI to profilers such as Valgrind"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=7974e16b472f00bbbadf2d006aa00c50 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gettext gtk-icon-cache

DEPENDS += "\
    kcoreaddons-native  \
    kdoctools-native \
    ki18n-native \
    kauth-native \
    kconfig-native \
    karchive \
    kwidgetsaddons \
    kxmlgui \
    kio \
    kdbusaddons \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "5663266abef6bbe731023a431bdde4cd"
SRC_URI[sha256sum] = "c21f3ac2568739b45919b13c2d77f79af9ea3beb51ec7339e700ae59b68d5fa9"

FILES_${PN} += " \
    ${datadir}/kxmlgui5 \
"
