SUMMARY = "Power management support for Liri"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri gsettings

PV = "0.9.0+git${SRCPV}"

SRCREV = "22c9288d32c33569a1886a061f461e1735b546f0"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtwayland \
    qtgraphicaleffects \
    qtquickcontrols2 \
    qtsvg \
    liri-fluid \
    liri-qtgsettings \
    liri-libliri \
    solid \
"

EXTRA_OECMAKE += "-DINSTALL_SYSCONFDIR=${sysconfdir}"

FILES_${PN} += " \
    ${datadir}/liri-settings \
    ${datadir}/liri-shell \
    ${OE_QMAKE_PATH_QML} \
"
