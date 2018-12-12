SUMMARY = "Themes for a uniform look throughout Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRC_URI += "file://0001-Set-correct-path-for-grub-themes.patch"
SRCREV = "37e0c45704cdda48dedd31c10e20c632701e76c3"
S = "${WORKDIR}/git"

PACKAGES += " \
    ${PN}-grub \
    ${PN}-plymouth \
    ${PN}-sddm \
"

RDEPENDS_${PN}-plymouth += " \
    plymouth \
    plymouth-set-default-theme \
"

FILES_${PN} += "${datadir}/color-schemes"
FILES_${PN}-grub += "/boot/grub/themes"
FILES_${PN}-plymouth += "${datadir}/plymouth/themes"
FILES_${PN}-sddm += "${datadir}/sddm/themes"

pkg_postinst_${PN}-plymouth() {
#!/bin/sh
plymouth-set-default-theme -R lirios
}
