SUMMARY = "GUI configuration tool for compton X composite manager"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt pkgconfig

DEPENDS += "libconfig"

SRCREV = "8ae8fbb95e2958adeaac681077a2751a1a776a07"
PV = "0.1.0+git${SRCPV}"

FILES_${PN} += "${datadir}/${BPN}/compton.conf.example"

EXTRA_OECMAKE += "-DUSE_QT5=ON"
