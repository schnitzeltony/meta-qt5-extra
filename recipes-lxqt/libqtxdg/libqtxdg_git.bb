SUMMARY = "libqtxdg is An Qt implementation of freedesktop.org xdg specifications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

# libmagic is supplied by file
DEPENDS += " \
    qtsvg \
    file \
"

EXTRA_OECMAKE += " \
    -DQTXDGX_ICONENGINEPLUGIN_INSTALL_PATH=${OE_QMAKE_PATH_PLUGINS}/iconengines \
"

SRCREV = "4e7e58f2705b322d14cc39d786aea03f5becba11"
PV = "3.3.0"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/iconengines"
