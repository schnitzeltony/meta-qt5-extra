SUMMARY = "GUI tools to adjust settings of the operating system"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation

DEPENDS += " \
    liblxqt \
"

SRCREV = "a1d90aca4651a96c769e141365d6f7028f9802cc"
PV = "0.17.0"

FILES_${PN} += "${datadir}/polkit-1"

RDEPENDS_${PN} += "lxqt-policykit"
RRECOMMENDS_${PN} += "polkit-group-rule-datetime"
