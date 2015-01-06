SUMMARY = "Hawaii desktop package collection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

RDEPENDS_${PN} = " \
	cinema \
	eyesight \
	pss \
	pss-framework \
	hawaii-system-preferences \
	hawaii-terminal \
	hawaii-wallpapers \
	polkit-qt-1 \
	qtaccountsservice \
	qtconfiguration \
	swordfish \
	wind \
"
