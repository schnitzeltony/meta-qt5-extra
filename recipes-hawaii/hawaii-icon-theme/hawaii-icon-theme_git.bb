SUMMARY = "Icon themes for the Hawaii desktop environment"
LICENSE = "GPLv3 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii gtk-icon-cache

SRCREV = "dfa9938a4ccc47c7b8ce7974afe1f6836b1e58cf"
PV = "v0.6.90+git${SRCPV}"
S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/icons"

RREPLACES_${PN} = "hawaii-icon-themes"
RPROVIDES_${PN} = "hawaii-icon-themes"
RCONFLICTS_${PN} = "hawaii-icon-themes"

