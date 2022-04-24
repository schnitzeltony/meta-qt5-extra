SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += " \
    liblxqt \
"

SRCREV = "2e62caa3e92f5857d493de0ea6e53d722ab2d084"
PV = "1.1.0"

FILES:${PN} += "${datadir}/polkit-1"

RDEPENDS:${PN} += "lxqt-policykit"
RRECOMMENDS:${PN} += "polkit-group-rule-datetime"
