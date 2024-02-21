package caclawmod;

import com.evacipated.cardcrawl.modthespire.lib.SpireInsertPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.localization.CardStrings;

@SpirePatch2(clz=Claw.class, method=SpirePatch.CONSTRUCTOR)
public class ClawNamePatch {
    @SpireInsertPatch(rloc=1)
    public static void Insert(Claw __instance) {
        __instance.name = "Ca-claw!";
        __instance.rawDescription = "Deal !D! damage. NL Add a copy of this card to your discard pile. Increase the damage of ALL Claw cards by !M! this combat.";
        __instance.initializeDescription();
    }
}
