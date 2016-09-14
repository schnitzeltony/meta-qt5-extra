SUMMARY = "Icon themes for the Hawaii desktop environment"
LICENSE = "GPLv3 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii gtk-icon-cache

SRCREV = "4a0d806c28f25aa072d9c5b849ec48a565721b30"
PV = "v0.8.0"
S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/icons"

RREPLACES_${PN} = "hawaii-icon-themes"
RPROVIDES_${PN} = "hawaii-icon-themes"
RCONFLICTS_${PN} = "hawaii-icon-themes"

