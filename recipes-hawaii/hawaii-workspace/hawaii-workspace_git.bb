SUMMARY = "Base applications for Hawaii"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPLv2.1;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii systemd

DEPENDS += " \
    libhawaii \
    greenisland \
    polkit-qt-1 \
    qt-gstreamer \
"

SRCREV = "c882b526c131d860d584197d8141120535be324d"
PV = "0.6.90+git${SRCPV}"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += " \
    -DSYSTEMD_USER_UNIT_DIR=${systemd_system_unitdir} \
"

FILES_${PN} += " \
    ${datadir}/glib-2.0 \
    ${datadir}/desktop-directories \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RREPLACES_${PN} = "hawaii-baseapps"
RPROVIDES_${PN} = "hawaii-baseapps"
RCONFLICTS_${PN} = "hawaii-baseapps"
